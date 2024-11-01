pipeline {
    agent any
    tools {
        maven 'Maven' // Adjust this to the Maven version installed on your Jenkins server
    }
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