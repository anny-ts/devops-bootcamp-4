pipeline {
    agent any
    tools {
        maven 'Maven' // Adjust this to the Maven version installed on your Jenkins server
        jdk 'jdk21'
    }
    stages {
        stage('Verify Java') {
            steps {
//                 sh '/var/jenkins_home/tools/hudson.model.JDK/temurinjdk-21/jdk-21.0.5+11/bin/java -version'
                sh 'ls -la /var/jenkins_home/tools/hudson.model.JDK/jdk21/jdk-21.0.5+11/bin'
            }
        }
        stage('Checkout') {
                steps {
                    // Checkout code from the SCM configured in Jenkins
                    checkout scm
                }
            }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Checkstyle') {
            steps {
                sh 'mvn validate'
            }
        }
    }
    post {
        always {
            recordIssues {
                enabledForFailure: true, aggregatingResults: true
                tools: [java(), checkStyle(pattern: 'checkstyle-result.xml', reportEncoding: 'UTF-8')]
            }
        }
    }
}