**Table of Contents**  *generated with [DocToc](http://doctoc.herokuapp.com/)*

- [Intro](#intro)
- [Camunda Fox CE Platform](#camunda-fox-ce-platform)
- [Maven](#maven)
	- [Version](#version)
	- [Add repos to settings.xml](#add-repos-to-settingsxml)
	- [Install projects and archetypes](#install-projects-and-archetypes)
	- [Using archetypes](#using-archetypes)
	- [Deploying process applications](#deploying-process-applications)
- [Contents](#contents)

# Intro

This repository contains examples of JEE6 maven process applications running on Camunda FOX CE platform (http://www.camunda.com/).

My goal is to study the BPMS Camunda Fox/Activiti acting as a process manager (http://www.eaipatterns.com/ProcessManager.html) orchestrating human tasks and services in a SOA/BPM environment.

# Camunda Fox CE Platform

Run the script as below to download and run for the first time Camunda Fox CE platform embedded in Jboss.
After running the script, you can access the Activiti explorer at: http://localhost:8080/explorer

	cd ~/git/camundafox-ce-apps/install/
	sh installCamundaFoxPlatform.sh

The environment will be installed in:

	 ~/camunda-fox-tests-env/

# Maven 

## Version

The applications use Maven 3.

## Add repos to settings.xml

Put the following repositories in '~/.m2/settings.xml' as in the example file below:



	<?xml version="1.0" encoding="UTF-8"?>

	<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
	          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
	
	
	  <profiles>
	
	    <profile>
	      <id>default</id>
	
	      <activation>
	        <activeByDefault/>
	      </activation>
	
	      <repositories>
		<!-- jboss release repo -->
		<repository>
			<id>jboss-public-repository-group</id>
			<name>JBoss Public Maven Repository Group</name>
			<url>https://repository.jboss.org/nexus/content/groups/public/</url>
			<layout>default</layout>
			<releases>
				<enabled>true</enabled>
				<updatePolicy>never</updatePolicy>
			</releases>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
	
		<!-- primefaces repository -->
		<repository>
			<id>prime-repo</id>
			<name>PrimeFaces Maven Repository</name>
			<url>http://repository.primefaces.org</url>
			<layout>default</layout>
		</repository>
	
		<!-- Camundafox repository -->
		<repository>
			<id>camunda-fox-ce</id>
			<url>https://app.camunda.com/nexus/content/repositories/fox-ce/</url>
		</repository>
	      </repositories>
	    </profile>
	  </profiles>
	
	  <activeProfiles>
	    <activeProfile>default</activeProfile>
	  </activeProfiles>
	
	</settings>

## Install projects and archetypes

In the root directory of the repo, type:

	mvn clean install

If you get a BUILD SUCESSFUL message then you're ready to continue.
Otherwise, verify your maven's version and settings.xml.

## Using archetypes
After installation you can use the archetypes through commandline (http://maven.apache.org/archetype/maven-archetype-plugin/usage.html) or in your favorite IDE.
In Eclipse, for example, choose the archetype in the New Maven Project Wizard.


## Deploying process applications
Run:

	mvn clean package 
and then copy the generated WAR or EAR to 

	~/camunda-fox-tests-env/appserver/fox-platform-ce-jboss-XXX/server/jboss-as-YYY.Final/standalone/deployments/

# Contents
This repository contains:
- BOM and parent projects to process application and service clients;
- maven archetype to process applications packaged as WAR;
- example process applications to Camunda Fox CE Platform (http://www.camunda.com/):
	- calculatorws-process:  bpmn process which invokes two simple services tasks, a Hello world Task and a Calculator webservice task.
