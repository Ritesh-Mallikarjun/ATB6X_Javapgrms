package ATB_6X_May.Single_Inheritance.SIngleInheritancePart2;

public class Gallery {
    private String Appname;

    public String getAppname() {
        return Appname;
    }

    public void getAccess(String appname, boolean isAuth) {
        if(isAuth) {
            this.Appname = appname;
            System.out.println("Yes u can access the images from the gallery");
        }
        else{
            System.out.println("Sorry cannot provide access to 3rd party apps");
        }
    }

    Gallery(){
        System.out.println("Using Gallery Application");
    }

    private void createAlbums(){
        System.out.println("I will help create albbums");
    }

    private void creatCollage(){
        System.out.println("I will help create collage");
    }

    private void createFolder(){
        System.out.println("I will help create new folder!!!");
    }

    private void trashFolder(){
        System.out.println("I will display trash folder, deleted pics");
    }

    protected String display(String image){
        System.out.println("i will display the pictures only to secured apps!!!");
        return image;
    }

}
