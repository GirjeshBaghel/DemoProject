pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'build successfully'
        sh 'mvn clean'
        sh 'mvn install'
      }
    }

  }
}