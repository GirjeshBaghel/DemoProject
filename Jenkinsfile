pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Demo Project Successfully'
        sh 'mvn clean'
        sh 'mvn install'
        sh '''java -jar /Users/girjeshbaghel/.jenkins/workspace/first_1maven/target/DemoProject-0.0.1-SNAPSHOT.jar
'''
      }
    }

  }
}