public interface CloudServicePlatform {
    public void hostingTo (AppWeb app);
    /*public void hostingTo (AppWeb app) {
        if (cloudServicePlatform==1) {
            System.out.println("Connect to AWS");
            // Logic
        }if (cloudServicePlatform==2) {
            System.out.println("Connect to Microsoft Azure");
            // Logic
        }else{
            System.out.println("Connect to Google Cloud");          
            // Logic
        }                                                           
    }
    // More Methods
         */
}
//INTERFACE SEGREGATION PRINCIPLE 
// DEJAR LA CLASE CLOUDSERVICEPLATFORM COMO INTERFAZ CON LA FUNCION HOSTINGTO Y CREAR SUBCLASES PARA AWS, MICROSOFT AZURE, GOOGLE CLOUD QUE IMPLEMENTEN DICHA INTERFAZ
//CloudServicePlatform class using strategy pattern (OCP)