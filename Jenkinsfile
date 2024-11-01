pipeline {
    agent any
    stages {
        stage('Checkout') {
                steps {
                    // Checkout code from the SCM configured in Jenkins
                    checkout scm
                }
            }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}