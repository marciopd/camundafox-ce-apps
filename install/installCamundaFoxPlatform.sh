echo '--------------------------------------'
echo 'Camunda Fox CE Platform installer'
echo 'https://github.com/marciopd/camundafox-ce-apps/README.md'
echo 'This scripts installs a camunda fox CE platform in order to deploy and run the developed process applications.'
echo '--------------------------------------'
echo '1 - Creating appserver directory: ~/camunda-fox-tests-env/appserver'
mkdir -p ~/camunda-fox-tests-env/appserver
echo '--------------------------------------'
echo '2 - Downloading Camunda Fox CE Platform'
wget http://fox.camunda.com/community/release/fox-platform/jboss7.1/1.32.0/fox-platform-ce-jboss-1.32.0.zip -P ~/camunda-fox-tests-env/appserver
echo '--------------------------------------'
echo '3 - Unzipping...'
unzip ~/camunda-fox-tests-env/appserver/fox-platform-ce-jboss-1.32.0.zip -d ~/camunda-fox-tests-env/appserver/
echo '--------------------------------------'
echo '3 - Running FOX CE application server'
sh ~/camunda-fox-tests-env/appserver/fox-platform-ce-jboss-1.32.0/server/jboss-as-7.1.0.Final/bin/standalone.sh
