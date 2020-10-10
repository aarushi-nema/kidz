/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.kidz.defined.helper;

import platform.webservice.bi.*;
import platform.resource.BaseResource;
import application.kidz.defined.resource.*;
import platform.resource.BaseResource;
import platform.helper.BaseHelper;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class Don't modify it.Extend this file for additional functionality **********
 * 
 */
 public class WordFamilyWordHelper extends BaseHelper {
		public WordFamilyWordHelper() {super(new WordFamilyWord());}
		private static WordFamilyWordHelper instance;
		public static WordFamilyWordHelper getInstance() {if (instance == null)	{instance = new WordFamilyWordHelper();register_birecord();} return instance;}
		public static void register_birecord() {
			BIRecord record;
		}
}