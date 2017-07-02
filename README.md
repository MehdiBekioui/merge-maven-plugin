# Merge Maven Plugin

The merge maven plugin allows you to merge multiple files into one. Target has to be a file and sources could be files or directories. The order of sources is used to merge files. If a source path is a directory with sub-directories and files, then sub-directories are merged before files.

## Plugin declaration

Default phase: generate-sources

```xml
<build>
  <plugins>
    <plugin>
      <groupId>com.bekioui.maven.plugin</groupId>
      <artifactId>merge-maven-plugin</artifactId>
      <version>1.0.0</version>
      <executions>
        <execution>
          <id>merge-files</id>
          <goals>
            <goal>merge</goal>
          </goals>
          <configuration>
            <merges>
              <merge>
                <target>${project.build.directory}/merge/merge.txt</target>
                <sources>
                  <source>src/main/resources/directory</source>
                  <source>src/main/resources/file.txt</source>
                </sources>
              </merge>
            </merges>
          </configuration>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

## Goal

* `merge:merge`: merge multiple files into one

## License
	
	Copyright (C) 2017 Mehdi Bekioui (consulting@bekioui.com)
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
		http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.