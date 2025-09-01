pipeline {
  agent any 
    stages {
      stage('Compile') {
        steps {
          bat 'javac Fact.java'
        }
      }
      stage('Test') {
        steps {
          bat 'javac Test.java' 
        }
      }
      stage('Run') {
        steps {
          bat 'java Fact' 
        }
      }
      stage('Package JAR') {
        steps {
          bat "cfm 'factorial.jar Manifest.txt Fact.class'"
        }
      }
      stage('Archive JAR') {
        steps {
          archiveArtifacts artifacts: factorial.jar
        }
      }
    }
  post {
    success{
      echo 'build, test and run is successful, artifact is ready' 
    }
    failure {
      echo 'build failed'
    }
  }
}
  
      
