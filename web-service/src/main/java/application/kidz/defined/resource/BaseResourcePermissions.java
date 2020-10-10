package application.kidz.defined.resource;

import java.util.HashSet;
import java.util.Set;
import platform.defined.ResourcePermission;
public class BaseResourcePermissions {
public static Set<ResourcePermission> resourcePermissions = new HashSet<ResourcePermission>();
		static {resourcePermissions.add(new ResourcePermission("word_family_word", "word_family_word", "", new String[]{"create","modify","get","delete"}));
resourcePermissions.add(new ResourcePermission("sight_word", "sight_word", "", new String[]{"create","modify","get","delete"}));
resourcePermissions.add(new ResourcePermission("sight_word_category_type", "sight_word_category_type", "", new String[]{"create","modify","get","delete"}));
resourcePermissions.add(new ResourcePermission("word_family", "word_family", "", new String[]{"create","modify","get","delete"}));
resourcePermissions.add(new ResourcePermission("sight_word_category", "sight_word_category", "", new String[]{"create","modify","get","delete"}));
		}
}