# Merge Maven Plugin

The merge maven plugin allows you to merge multiple files into one.

## Plugin declaration

Default phase: generate-sources

```xml
<build>
  <plugins>
    <plugin>
      <groupId>com.bekioui.maven.plugin</groupId>
      <artifactId>merge-maven-plugin</artifactId>
      <version>1.1.0</version>
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
                <override>true</override>
              </merge>
              <merge>
                <target>${project.build.directory}/merge.csv</target>
                <searchDir>src/main/resources/directory</searchDir>
                <pattern>file[0-9]+.csv</pattern>
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

## Configuration

**Target** tag has to be a file.

### List of sources

You can merge files by declaring a list of sources inside the **sources** tag. Each source can be a file or a directory.

The order of sources is used to merge files. If a source is a directory with sub-directories and files then sub-directories are merged before files.

### Pattern

You can define a regular expression to select files to be merged. Use **searchDir** and **pattern** tags instead of **sources** tag.

### Override

Optional tag to override existing targeted file. The default value is false and a MojoExecutionException is thrown if the targeted file exists.

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
