pipeline {
  agent any 
    stages {
      stage('Compile') {
        steps {
          bat 'Fact.java Test.java'
        }
      }
      stage('Test') {
        steps {
          bat 'java Test' 
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
  
      
