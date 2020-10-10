package application.kidz.servlet.base.menu;

import platform.webservice.ui.UIServletContext;
import platform.webservice.ui.component.BaseView;

public class AmrImageCardView extends BaseView {
	UIServletContext mContext;
	public AmrImageCardView(UIServletContext context) {
		mContext = context;
	}
	/* <div class="box box-solid">
                  <div class="box-body clearfix padding-10">
                     <div class="user-card-condensed">
                        <a href="/demomaininstitute/" class=""><img src="/static/civilscloud_project/images/institute.svg" class="user-card-img" alt="user profile pic"></a>
                        <div class="user-details">
                           <h4 class="user-name "><a href="/demomaininstitute/" class=""> Demo Main Institute </a></h4>
                           <div>
                              <div class="font-14 text-yellow text-bold margin-b-5">6 Points</div>
                              <div class="text-center"></div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
	*/
	public void buildUI() {	
		getView().addAttribute("","");
		getView().addAttribute("style","margine-top:30px");
	}
}
