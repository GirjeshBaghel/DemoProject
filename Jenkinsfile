pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Demo Project Successfully'
        sh 'clean'
        sh 'install'
        sh '''java -jar /Users/girjeshbaghel/.jenkins/workspace/first_1maven/target/DemoProject-0.0.1-SNAPSHOT.jar
'''
      }
    }

  }
}