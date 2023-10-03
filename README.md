# NavigationDrawer-RecyclerView-ImageSlider-AndroidStudio-Java

In this project, an application similar to a food application was developed in Java in Android Studio. Simply the following user interface features were used in this application:
- Navigation Drawer
- Recycler View
- Image Slider


### Image Slider
- When the application is first opened, it greets us with the Home Page screen. On this screen, there is an image slider that displays real-time food discounts. By simply adding a library plugin and using the imageslider tag, we were able to create a row of three images with automatic transitions. 
- We populated the images in the Image Slider by adding elements to the ArrayList in the MainActivity. </br></br>

<p align="center">
  <img src = "app/src/main/res/AppImages/imageSliderPrtsc.png" witdh="500" height="700">
</p>

</br> 
- Related components: activity_main, MainActivity


</br> </br> 

### Navigation Drawer

- In this application, a vertical navigation drawer has been developed. First, an Android resource directory named "menu" was created under the "res" folder. In this "menu" directory, the items intended to appear in the navigation drawer's content were defined. Typically, these elements are specified with a name, an icon, and an ID. This method is a common approach used to organize the content of the navigation drawer and facilitate user navigation within the application.

- Subsequently, a header was created. Both the header and the item list were defined within the "navigationView" inside the main activity. Similarly, a custom toolbar was designed and placed in the relative layout of the main activity.

- By default, Home Page is selected at first startup. </br></br>

<p align="center">
  <img src = "app/src/main/res/AppImages/navigationDrawerPrtsc.png" witdh="500" height="700">
</p>

</br> 
- Related components: nav_menu, nav_header,custom_toolbar, activity_main, MainActivity

</br> </br> 

### Recycler View
- When the 'Food' option is selected in the navigation drawer, you will notice a horizontal RecyclerView displaying multiple food images. 
- To enable this functionality, we have implemented a data class and an adapter class to manage the properties of each item within the RecyclerView.
- Afterward, we populated the RecyclerView by assigning values to a one-dimensional array of type FoodData within the Food class.  </br></br>

 
<p align="center">
  <img src = "app/src/main/res/AppImages/recyclerViewPrtsc.png" witdh="500" height="700">
</p>


</br> 
- Related components: activity_food, food_item_list, custom_toolbar, Food, FoodAdapter, FoodData

</br> </br> 

### Full Screen Food Image 
- When you click on any food image in the RecyclerView, the FullScreenFoodImage class is launched as defined in the FoodAdapter's onBindViewHolder method. The selected image is displayed in this class with an animation.
- The image to be displayed is retrieved from the FoodAdapter class using an intent. </br></br>
 
<p align="center">
  <img src = "app/src/main/res/AppImages/pizzaPrtsc.png" witdh="500" height="700">
</p>

</br> 
- Related components: activity_full_screen_food_image, FullScreenFoodImage, FoodAdapter
