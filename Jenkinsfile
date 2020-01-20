node {
	stage('scm checkout'){
		git 'https://github.com/jameshsmla/springpipelinedemo.git'
	}
	stage('compile and packaging'){
		
		def jdkpath=tool name: 'JAVA_HOME', type: 'jdk'
		def mvnHome= tool name: 'M3', type: 'maven'
		echo '-------------start version information ---------'
	}
stage ('clean'){
		
	bat "mvn clean"
	}
	stage ('running app'){
		
	bat "mvn install"
	}
}
