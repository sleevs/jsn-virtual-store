pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'github-token', url: 'https://github.com/sleevs/jsn-virtual-store.git'
            }
        }
    }
}
