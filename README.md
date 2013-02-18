# Intro

This repository contains examples of JEE6 maven process applications running on Camunda FOX CE platform (http://www.camunda.com/).

My goal is to study the BPMS Camunda Fox/Activiti acting as a process manager (http://www.eaipatterns.com/ProcessManager.html) and really orchestrating services in a SOA/BPM environment.

# Maven settings.xml

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


# Camunda Fox CE Platform

Run the script 'installCamundaFoxPlatform.sh' to download and run for the first time Camunda Fox CE platform embedded in Jboss.
After running the script, you can access the Activiti explorer at: http://localhost:8080/explorer


# Contents
This repository contains:
- maven archetype to process applications packaged as WAR;
- example process applications to Camunda Fox CE Platform (http://www.camunda.com/);

 