package org.codehaus.mojo.jdepend;

/*
 * #%L
 * JDepend Maven Plugin
 * %%
 * Copyright (C) 2006 - 2014 Codehaus
 * %%
 * Licensed under the Apache License 2.0
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  
 * The ASF licenses this file to you under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file 
 * except in compliance with the License.  
 * 
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * #L%
 */

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Run JDepend and generate a site report. Goal which generate the JDepend metrics.
 * 
 * @author Karl-Heinz Marbaise
 */
@Mojo( name = "generate-no-fork", requiresProject = true, defaultPhase = LifecyclePhase.SITE )
public class JDependNoForkMojo
    extends AbstractJDependMojo
{

}
