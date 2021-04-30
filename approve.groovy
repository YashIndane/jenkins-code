pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Hello build'
            }
        }
        
        stage('test') {
            steps {
                echo 'Hello test'
            }
          
        }
        
        stage('deploy') {
            steps {
                echo 'Hello deploy'
            }
              input {
                message "do ypu want to approve and deploy?"
            }
        }
    }
}
