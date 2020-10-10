package application.kidz.defined;


import platform.defined.ResourceGenerator;
import platform.util.Util;

public class GenerateResource {

	public static void main(String []args) throws Exception {

		String web_app_director = null;
		if (args.length > 0) {
			web_app_director = args[0];
		}
		ResourceGenerator generator = new ResourceGenerator("application.kidz.defined","./src/main/java/application/kidz/defined/");
		if (!Util.isEmpty(web_app_director)) {
			generator.setWeb_app_directory(web_app_director);
		}
		generator.generateCode("./src/main/java/application/kidz/defined/", null);
	}
}


