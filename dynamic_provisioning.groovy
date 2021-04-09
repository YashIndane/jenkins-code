pipeline{
    
    agent none
    
    stages{
        
        stage('Build'){
            agent{
                label 'dtemp'
            }
            
            steps{
               echo "hey we are building ..."
               sleep 2
            }   
        }
        
        stage('Test'){
            agent{
                label 'dtemp'
            }
            
            steps{
               echo "mic ... check testing!"
               sleep 2
            }   
        }
        
        stage('Deploy'){
            agent{
                
                label 'dtemp'
            }
            
            steps{
               echo "deploying... have patience"
               sleep 2
            }   
        }
        
    }
    
}
