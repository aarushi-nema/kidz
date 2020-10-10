package application.kidz.defined.resource;

import java.util.HashSet;
import java.util.Set;
import platform.defined.ResourcePermission;
public class BaseResourcePermissions {
public static Set<ResourcePermission> resourcePermissions = new HashSet<ResourcePermission>();
		static {resourcePermissions.add(new ResourcePermission("word_family_word", "word_family_word", "", new String[]{"create","modify","get","delete"}));
resourcePermissions.add(new ResourcePermission("word_family", "word_family", "", new String[]{"create","modify","get","delete"}));
		}
}