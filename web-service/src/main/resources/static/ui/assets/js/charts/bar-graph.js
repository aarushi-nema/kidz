$(document).ready(function() { //if the DOM is ready

	var SolidGraphs = {

		animation_value_scaleX: 'animation-scaleX',
		animation_value_scaleY: 'animation-scaleY',
		animation_value_slideUp: 'animation-slideUp',
		animation_value_slideDown: 'animation-slideDown',
		animation_value_fadeIn: 'animation-fadeIn',
		init: function() {

			this.cacheDom();
			this.bindEvents();
			this.animateGraphs();
			
		},
		cacheDom: function() {

			this.$document = $(document);
			this.$window = $(window);
			this.$this = $(this);
			this.$graph_container = $('.graph-container');
			this.$chart_title = $('.chart-title');
			this.$animate_on_appear = $('.animate-on-appear');
			this.$chart_bars_h = $('.chart-bars');
			this.$chart_bars_v = $('.chart-columns');
			this.$bar_lists_h = $('.chart-bars li span');
			this.$bar_lists_v = $('.chart-columns li span');
			this.$tab_container_label = $('.tab-container > label');
			this.$accordion_level_label = $('.accordion-level > label');

		},
		bindEvents: function() {

			this.$tab_container_label.on('click', this.animateGraphs.bind(this));
			this.$accordion_level_label.on('click', this.animateGraphs.bind(this));
			
		},
		clearAnimation: function() {

			this.removeClassRegEx(this.$document.find('[class*="animation-"]'),/^animation-/); //for graph on tabs

		},
		animateGraphs: function() {

			var that = this;
			
			var graph_container = '.graph-container';
			var chart_title = ".chart-title";
			var legend_box = '.legend-box';

			var bar_lists_h = '.chart-bars li span';
			var chart_bar_y_axis = '.chart-bar-y-axis li span';
			var chart_bar_x_axis = '.chart-bar-x-axis li';
			var x_axis_label_h = '.x-axis-label';
			var bar_x_axis = '.bar-x-axis';
			
			var bar_lists_v = '.chart-columns li span';
			var column_x_axis = '.chart-column-x-axis li';
			var column_y_axis = '.column-y-axis';
			var chart_column_contents = '.chart-columns-contents';
			var chart_column_y_axis = '.chart-column-y-axis li'

			this.clearAnimation();

			that.$animate_on_appear.appear(function() {

				var _this = $(this);

				setTimeout(function() {

					that.animateElement(_this.parents(graph_container).find(chart_title), that.animation_value_slideDown, 150);
					that.animateElement(_this.parents(graph_container).find(x_axis_label_h), that.animation_value_slideUp, 60);

					if (_this.find(that.$bar_lists_h).length >= 1) {

						that.animateElement(_this.parents(graph_container).find(bar_x_axis), that.animation_value_slideUp, 200);
						that.animateElement(_this.parents(graph_container).find(chart_bar_x_axis), that.animation_value_slideUp, 60);
						that.animateElement(_this.find(that.$bar_lists_h), that.animation_value_scaleX, 150);
						that.animateElement(_this.parents(graph_container).find(chart_bar_y_axis), that.animation_value_fadeIn, 60);
						that.animateElement(_this.parents(graph_container).find(legend_box), that.animation_value_fadeIn, 500);
						
					} else {

						that.animateElement(_this.parents(graph_container).find(column_x_axis), that.animation_value_slideUp, 100);
						that.animateElement(_this.parents(graph_container).find(chart_column_contents), that.animation_value_fadeIn, 200);
						that.animateElement(_this.parents(graph_container).find(column_y_axis), that.animation_value_fadeIn, 200);
						that.animateElement(_this.parents(graph_container).find(chart_column_y_axis), that.animation_value_slideUp, 200);
						that.animateElement(_this.find(that.$bar_lists_v), that.animation_value_scaleY, 120);
						that.animateElement(_this.parents(graph_container).find(legend_box), that.animation_value_fadeIn, 500);

					}

	
				}, 500);


			},{accX: 0, accY: -10});

		},
		animateElement: function(target, animation_value, delay) {

			$.each(target, function(index, element) {

				setTimeout(function() {

					$(element).addClass(animation_value);

				}, (index * delay));

			});

		},
		removeClassRegEx: function(target_element,target_pattern) { 

			var target = target_element;

			if (target.length > 0) {

				var classes = target.attr('class').split(" "); //attribute classes to array
				var pattern = target_pattern;

				for (x in classes) { //iterate each array and remove class based on the pattern match

					if (classes[x].match(pattern)) {

						target.removeClass(classes[x]);

					}

				}

			}

		}

	};

	SolidGraphs.init();

});