job('autojob'){
      description('my-first-job')
  
       scm{
         github(ownerandProject='YashIndane/simple-java-maven-app' , branch='master')
       }
  
       steps{
          
         maven{
             goals('package')
             mavenInstallation('mv')
         }
         
         shell('java -jar target/*.jar')
       }
}
