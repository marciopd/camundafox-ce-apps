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
