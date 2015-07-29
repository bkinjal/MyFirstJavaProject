package com.digitec.mavenPlugin;

public class MavenPlugins {
	
}

Maven Plugins           
Maven is - at its heart - a plugin execution framework; all work is done by plugins. Looking for a specific goal to execute? There are the build and the reporting plugins:-Build plugins will be executed during the build and they should be configured in the <build/> element from the POM.-Reporting plugins will be executed during the site generation and they should be configured in the <reporting/> element from the POM. Because the result of a Reporting plugin is part of the generated site, Reporting plugins should be both internationalized and localized.

Plugin    	
Description
Core plugins	Plugins corresponding to default core phases (ie. clean, compile). They may have multiple goals as well.
clean
Clean up after the build.
compiler
Compiles Java sources.
deploy
Deploy the built artifact to the remote repository.
failsafe
Run the JUnit integration tests in an isolated classloader.
install
Install the built artifact into the local repository.
resources
Copy the resources to the output directory for including in the JAR.
site
Generate a site for the current project.
surefire
Run the JUnit unit tests in an isolated classloader.
verifier
Useful for integration tests - verifies the existence of certain conditions.


Packaging types/tools	
These plugins relate to packaging respective artifact types.
ear
Generate an EAR from the current project.
ejb
Build an EJB (and optional client) from the current project.
jar
Build a JAR from the current project.
rar
Build a RAR from the current project.
war
Build a WAR from the current project.
app-client/acr
Build a JavaEE application client from the current project.
shade
Build an Uber-JAR from the current project, including dependencies.
source
Build a source-JAR from the current project.


Reporting plugins	Plugins which generate reports, are configured as reports in the POM and run under the site generation lifecycle.

changelog
Generate a list of recent changes from your SCM.
changes
Generate a report from an issue tracker or a change document.
checkstyle
Generate a Checkstyle report.
doap
Generate a Description of a Project (DOAP) file from a POM.
docck
Documentation checker plugin.
javadoc
Generate Javadoc for the project.
jxr
Generate a source cross reference.
linkcheck
Generate a Linkcheck report of your project's documentation.
pmd
Generate a PMD report.
project-info-reports
Generate standard project reports.
surefire-report
Generate a report based on the results of unit tests.

Tools 	
These are miscellaneous tools available through Maven by default.
ant
Generate an Ant build file for the project.
antrun
Run a set of ant tasks from a phase of the build.
archetype
Generate a skeleton project structure from an archetype.
assembly
Build an assembly (distribution) of sources and/or binaries.
dependency
Dependency manipulation (copy, unpack) and analysis.
enforcer
Environmental constraint checking (Maven Version, JDK etc), User Custom Rule Execution.
gpg
Create signatures for the artifacts and poms.
help
Get information about the working environment for the project.
invoker
Run a set of Maven projects and verify the output.
jarsigner
Signs or verifies project artifacts.
patch
Use the gnu patch tool to apply patch files to source code.
pdf
Generate a PDF version of your project's documentation.
plugin
Create a Maven plugin descriptor for any mojos found in the source tree, to include in the JAR.
release
Release the current project - updating the POM and tagging in the SCM.
remote-resources
Copy remote resources to the output directory for inclusion in the artifact.
repository
Plugin to help with repository-based tasks.
scm
Execute SCM commands for the current project.
scm-publish
Publish your Maven website to a scm location.
stage
Assists with release staging and promotion.
toolchains
Allows to share configuration across plugins.

IDEs	
Plugins that simplify integration with integrated developer environments.	
eclipse
Generate an Eclipse project file for the current project.

Example
We've used maven-antrun-plugin extensively in our examples to print data on console. See Maven Build Profiles chapter. Let to understand it in a better way let's create a pom.xml in C:\MVN\project folder.
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>com.companyname.projectgroup</groupId>
<artifactId>project</artifactId>
<version>1.0</version>
<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-antrun-plugin</artifactId>
<version>1.1</version>
<executions>
<execution>
<id>id.clean</id>
<phase>clean</phase>
<goals>
<goal>run</goal>
</goals>
<configuration>
<tasks>
<echo>clean phase</echo>
</tasks>
</configuration>
</execution>     
</executions>
</plugin>
</plugins>
</build>
</project>
Next, open command console and go to the folder containing pom.xml and execute the following mvn command.
C:\MVN\project>mvn clean
Maven will start processing and display clean phase of clean life cycle
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------
[INFO] Building Unnamed - com.companyname.projectgroup:project:jar:1.0
[INFO]    task-segment: [post-clean]
[INFO] ------------------------------------------------------------------
[INFO] [clean:clean {execution: default-clean}]
[INFO] [antrun:run {execution: id.clean}]
[INFO] Executing tasks
[echo] clean phase
[INFO] Executed tasks
[INFO] ------------------------------------------------------------------
[INFO] BUILD SUCCESSFUL
[INFO] ------------------------------------------------------------------
[INFO] Total time: < 1 second
[INFO] Finished at: Sat Jul 07 13:38:59 IST 2012
[INFO] Final Memory: 4M/44M
[INFO] ------------------------------------------------------------------
The above example illustrates the following key concepts:
•	Plugins are specified in pom.xml using plugins element.
•	Each plugin can have multiple goals.
•	You can define phase from where plugin should starts its processing using its phase element. We've used clean phase.
•	You can configure tasks to be executed by binding them to goals of plugin. We've bound echo task with run goal of maven-antrun-plugin.
•	That's it, Maven will handle the rest. It will download the plugin if not available in local repository and starts its processing.

