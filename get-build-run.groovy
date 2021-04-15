pipeline{
    
    agent none
    
    stages{
        
        stage('Git'){
            agent{
                label 'dtemp'
            }
            
            steps{
                
               echo "hey we are downloading the code ..."
               git 'https://github.com/YashIndane/simple-java-maven-app.git'
               stash includes: '*' , name: 'thecode'
               
            }   
        }
        
        stage('Build'){
            agent{
                label 'dtemp'
            }
            
            steps{
                
               echo "hey we are building the package ..."
               unstash 'thecode'
               sh 'mvn package'
               stash includes: 'target/my-app-1.0-SNAPSHOT.jar' , name: 'thepackage'
              
            }   
        }
        
        stage('Run'){
            agent{
                label 'dtemp'
            }
            
            steps{
                
               echo "hey we are running the code ..."
               unstash 'thepackage'
               sh 'java -jar my-app-1.0-SNAPSHOT.jar'
              
            }   
        }
        
    }
    
}
