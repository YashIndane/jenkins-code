pipeline{
    
    agent any
    
    stages{
        
        stage('Build'){
            steps{
               echo "hey we are building ..."
               sleep 2
            }   
        }
        
        stage('Test'){
            steps{
               echo "mic .... check testing!"
               sleep 2
            }   
        }
        
        stage('Deploy'){
            steps{
               echo "deploying... have patience"
               sleep 2
            }   
        }
        
    }
    
}
