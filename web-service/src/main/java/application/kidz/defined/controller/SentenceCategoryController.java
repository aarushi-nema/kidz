/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package application.kidz.defined.controller;

import platform.webservice.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import platform.resource.BaseResource;
import application.kidz.defined.service.*;
import application.kidz.defined.resource.*;
import platform.webservice.BaseController;
import platform.db.*;
import java.util.*;

/*
 ********** This is a generated class Don't modify it.Extend this file for additional functionality **********
 * 
 */
@Controller
@RequestMapping("/api/{version}/sentence_category")
 public class SentenceCategoryController extends BaseController {
		public SentenceCategoryController() {super(new application.kidz.defined.resource.SentenceCategory(),new SentenceCategoryService());}
}