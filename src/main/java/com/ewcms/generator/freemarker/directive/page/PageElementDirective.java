/**
 * Copyright (c)2010-2011 Enterprise Website Content Management System(EWCMS), All rights reserved.
 * EWCMS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * http://www.ewcms.com
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ewcms.generator.freemarker.directive.page;

import com.ewcms.generator.freemarker.directive.DirectiveVariable;
import com.ewcms.generator.freemarker.directive.ElementDirective;


/**
 *
 * @author wangwei
 */
public abstract class PageElementDirective extends ElementDirective<Page>{

    @Override
    protected String defaultVariable() {
        return DirectiveVariable.Page.toString();
    }

}
