node {
	stage('scm checkout'){
		git 'https://github.com/jameshsmla/springpipelinedemo.git'
	}
	stage('compile and packaging'){
		
		def jdkpath=tool name: 'JAVA_HOME', type: 'jdk'
		
		
		def pred=sh "pwd"
		echo '-------------start version information ---------'
		echo "current dirct"+ pred
		echo '-------------start version information ---------'
		
	}
	stage ('running app'){
		def mvnHome= tool name: 'M3', type: 'maven'
		
		sh "pwd"
		sh "${mvnHome}/bin/mvn clean install"
		echo '-------------current working directory---------'
		sh "${pwd}"
		echo '-------------current working directory---------'
	}
	stage ('Release'){
		sh "java -jar /var/lib/jenkins/workspace/petzey-services/target/pripelinedemoproject-0.0.1-SNAPSHOT.jar"
	}
}
