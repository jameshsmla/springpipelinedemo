node {
	stage('scm checkout'){
		git 'https://github.com/jameshsmla/springpipelinedemo.git'
	}
	stage('compile and packaging'){
		
		def jdkpath=tool name: 'JAVA_HOME', type: 'jdk'
		
		echo '-------------start version information ---------'
		
	}
	stage ('running app'){
		def mvnHome= tool name: 'M3', type: 'maven'
		sh "pwd"
		sh "${mvnHome}/bin/mvn install"
	}
}
