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
		sh "${mvnHome}/bin/mvn install"
	}
}
