pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
      args '-v /home/dulip/.m2'
    }

  }
  stages {
    stage('Initialize') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean '''
      }
    }
    stage('build ') {
      steps {
        sh 'mvn -Dmaven.test.failure.ignore=true install'
      }
    }
    stage('Report') {
      steps {
        junit 'target/surefire-report/**/*.xml'
      }
    }
    stage('') {
      steps {
        archiveArtifacts 'target/*.jar.target/*.hpi'
      }
    }
  }
}