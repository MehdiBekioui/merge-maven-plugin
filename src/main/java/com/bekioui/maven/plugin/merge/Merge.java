/**
 * Copyright © 2017 Mehdi Bekioui (consulting@bekioui.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bekioui.maven.plugin.merge;

import java.io.File;
import java.util.List;

import org.apache.maven.plugins.annotations.Parameter;

public class Merge {

	@Parameter(property = "target", required = true)
	private File target;

	@Parameter(property = "sources", required = true)
	private List<File> sources;

	@Parameter(property = "pattern", required = true)
	private String pattern;

	@Parameter(property = "override")
	private boolean override;

	@Parameter(defaultValue = "${project.basedir}", readonly = true)
	private File searchDir;

	public File getTarget() {
		return target;
	}

	public List<File> getSources() {
		return sources;
	}

	public String getPattern() {
		return pattern;
	}

	public boolean isOverride() {
		return override;
	}

	public File getSearchDir() {
		return searchDir;
	}

	@Override
	public String toString() {
		return "Merge [target=" + target + ", sources=" + sources + ", pattern=" + pattern + ", override=" + override + ", searchDir=" + searchDir + "]";
	}

}
