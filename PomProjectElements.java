//package com.digitec.pomProjectElements;

//public class PomProjectElements {

//}
//Pom’s Project Elements

//This is a listing of the elements directly under the POM's project element. Notice that modelVersion contains 4.0.0. That is currently the only supported POM version for both Maven 2 & 3, and is always required.
//1.	<project xmlns="http://maven.apache.org/POM/4.0.0"
//2.	  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//3.	  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
//4.	                      http://maven.apache.org/xsd/maven-4.0.0.xsd">
//5.	  <modelVersion>4.0.0</modelVersion>
//6.	 
//7.	  <!-- The Basics -->
//8.	  <groupId>...</groupId>
//9.	  <artifactId>...</artifactId>
//10.	  <version>...</version>
//11.	  <packaging>...</packaging>
//12.	  <dependencies>...</dependencies>
//13.	  <parent>...</parent>
//14.	  <dependencyManagement>...</dependencyManagement>
//15.	  <modules>...</modules>
//16.	  <properties>...</properties>
//17.	 
//18.	  <!-- Build Settings -->
//19.	  <build>...</build>
//20.	  <reporting>...</reporting>
//21.	 
//22.	  <!-- More Project Information -->
//23.	  <name>...</name>
//24.	  <description>...</description>
//25.	  <url>...</url>
//26.	  <inceptionYear>...</inceptionYear>
//27.	  <licenses>...</licenses>
//28.	  <organization>...</organization>
//29.	  <developers>...</developers>
//30.	  <contributors>...</contributors>
//31.	 
//32.	  <!-- Environment Settings -->
//33.	  <issueManagement>...</issueManagement>
//34.	  <ciManagement>...</ciManagement>
//35.	  <mailingLists>...</mailingLists>
//36.	  <scm>...</scm>
//37.	  <prerequisites>...</prerequisites>
//38.	  <repositories>...</repositories>
//39.	  <pluginRepositories>...</pluginRepositories>
//40.	  <distributionManagement>...</distributionManagement>
//41.	  <profiles>...</profiles>
//42.	</project>
//The BaseBuild Element Set
//BaseBuild is exactly as it sounds: the base set of elements between the two build elements in the POM.
//<build>
//<defaultGoal>install</defaultGoal>
//<directory>${basedir}/target</directory>
//<finalName>${artifactId}-${version}</finalName>
//<filters>
//<filter>filters/filter1.properties</filter>
//</filters>
//...
//</build>
//	defaultGoal: the default goal or phase to execute if none is given. If a goal is given, it should be defined as it is in the command line (such as jar:jar). The same goes for if a phase is defined (such as install)
//	directory: This is the directory where the build will dump its files or, in Maven parlance, the build's target. It aptly defaults to ${basedir}/target.
//	finalName: This is the name of the bundled project when it is finally built (sans the file extension, for example: my-project-1.0.jar). It defaults to ${artifactId}-${version}. The term "finalName" is kind of a misnomer, however, as plugins that build the bundled project have every right to ignore/modify this name (but they usually do not). For example, if the maven-jar-plugin is configured to give a jar a classifier of test, then the actual jar defined above will be built as my-project-1.0-test.jar.
//	filter: Defines *.properties files that contain a list of properties that apply to resources which accept their settings (covered below). In other words, the "name=value" pairs defined within the filter files replace ${name} strings within resources on build. The example above defines the filter1.properties file under the filter/ directory. Maven's default filter directory is ${basedir}/src/main/filters/.
//The Build Element Set
//The Build type in the XSD denotes those elements that are available only for the "project build". Despite the number of extra elements (six), there are really only two groups of elements that project build contains that are missing from the profile build: directories and extensions.
//Directories
//The set of directory elements live in the parent build element, which set various directory structures for the POM as a whole. Since they do not exist in profile builds, these cannot be altered by profiles.
//1.	<project xmlns="http://maven.apache.org/POM/4.0.0"
//2.	  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//3.	  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
//4.	                      http://maven.apache.org/xsd/maven-4.0.0.xsd">
//5.	  ...
//6.	  <build>
//7.	    <sourceDirectory>${basedir}/src/main/java</sourceDirectory>
//8.	    <scriptSourceDirectory>${basedir}/src/main/scripts</scriptSourceDirectory>
//9.	    <testSourceDirectory>${basedir}/src/test/java</testSourceDirectory>
//10.	    <outputDirectory>${basedir}/target/classes</outputDirectory>
//11.	    <testOutputDirectory>${basedir}/target/test-classes</testOutputDirectory>
//12.	    ...
//13.	  </build>
//14.	</project>
//If the values of a *Directory element above is set as an absolute path (when their properties are expanded) then that directory is used. Otherwise, it is relative to the base build directory: ${basedir}.
