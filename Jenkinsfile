pipeline {
    agent any

    environment {
        JAVA_HOME = tool(name: 'JDK17', type: 'jdk')
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'github-token', url: 'https://github.com/sleevs/jsn-virtual-store.git', branch: 'main'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build finalizado com sucesso!'
        }
        failure {
            echo 'Ocorreu uma falha na build.'
        }
    }
}
