# Bahadir-Eray-BootcampFinishProject
## About Application
It is an application that makes travel sharing using a service over the Internet. 
You can register new places and transportations in the application. 
You can view the places you want to go from the search screen.

## ->Libraries and technologies used
* Navigation component : one activity contains multiple fragments instead of creating multiple activites.
* Retrofit : HTTP connection with the rest API and convert Travels json file to Kotlin/Java object.
* Room : Save Favori in local database.
* MVVM & LiveData : Saperate logic code from views and save the state in case the screen configuration changes.
* Coroutines : do some code in the background.
* view binding : instead of inflating views manually view binding will take care of that.
* Glide : Catch images and load them in imageView.





---

### ->The file structure is set up like this

```
├── adapter
│      ├── BookmarkAdapter.kt
│      ├── CategoriAdapter.kt
│      ├── DealsAdapter.kt
│      ├── MightAdapter.kt
│      ├── NearbyAdapter.kt
│      ├── SeeAllAdapter.kt
│      ├── TopDestinationsAdapter.kt
│      └── TopPicAdapter.kt
├── data
│    ├────── Model
│    │         ├── Favori
│    │         │       └── FavoriModel.kt      
│    │         └── Travel    
│    │                 ├── TravelsImage.kt 
│    │                 └── TravelsModel.kt
│    └────── RoomDb
│              ├── FavoriDao.kt
│              └── FavoriDataBase.kt
├── service
│    ├── TravelsAPI.kt
│    └── TravelsAPIService.kt
│        
├── Util
│    └── Util.kt
├── View
│    ├────── Activity
│    │           └── MainActivity.kt
│    ├────── Fragment
│               ├── DetailFragment.kt
│               ├── GuideFragment.kt
│               ├── HomeFragment.kt
│               ├── SearchFragment.kt
│               ├── SeeAllFragment.kt
│               └── TripFragment.kt
│        ├── <Feature>Fragment.kt
│        ├── <Feature>RecyclerviewAdapter.kt
│        ├── <Feature>ViewModel.kt
│        └── adapter
│            └── ViewHolder.kt
└── Viewmodel
     ├── BaseViewModel.kt
     ├── DetailViewModel.kt
     ├── GuideViewModel.kt
     ├── HomeViewModel.kt
     ├── SearchViewModel.kt
     ├── SeeAllViewModel.kt
     └── TripViewModel.kt

```

### ->İmplementation Library

```
def lifeCycleExtensionVersion = '1.1.1'
    def supportVersion = '28.0.0'
    def retrofitVersion = '2.9.0'
    def glideVersion = '4.13.2'
    def rxJavaVersion = '2.1.1'
    def room_version = "2.3.0"
    
    dependencies {
    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:$room_version")

    //viewmodel
    implementation "android.arch.lifecycle:extensions:$lifeCycleExtensionVersion"

    //Coroutine
    implementation "androidx.legacy:legacy-support-v4:1.0.0"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"

    //nav
    implementation 'androidx.navigation:navigation-fragment-ktx:2.5.2'
    implementation 'androidx.navigation:navigation-ui-ktx:2.5.2'

    //Design
    implementation "com.google.android.material:material:1.6.1"
    implementation "com.android.support:palette-v7:$supportVersion"
    implementation "com.android.support:design:$supportVersion"
    implementation 'de.hdodenhof:circleimageview:3.1.0'

    //Retrofit
    implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"
    implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"

    //RxJava
    implementation "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
    implementation "io.reactivex.rxjava2:rxandroid:$rxJavaVersion"
    implementation "androidx.room:room-rxjava3:$room_version"
    implementation "io.reactivex.rxjava3:rxandroid:3.0.0"

    //Glide
    implementation "com.github.bumptech.glide:glide:$glideVersion"

    //gif
    implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.17'

    //Room
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor "androidx.room:room-compiler:$room_version"
}

```
