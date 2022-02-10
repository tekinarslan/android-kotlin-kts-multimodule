
object Kotlin {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlin_coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val kotlin_serialization_json =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"

}
object AndroidX {
    const val material = "com.google.android.material:material:${Versions.material}"
    const val androidx_core = "androidx.core:core-ktx:${Versions.ktx}"
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val androidx_annotation = "androidx.annotation:annotation:${Versions.annotation}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val androidx_swiperefresh =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefresh}"
    const val androidx_viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    const val androidx_constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val androidx_webkit = "androidx.webkit:webkit:${Versions.webkit}"
    const val androidx_activity = "androidx.activity:activity-ktx:${Versions.activity}"
    const val androidx_fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val androidx_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val androidx_livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val androidx_lifecycle_runtime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val androidx_lifecycle_compiler =
        "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val androidx_preference = "androidx.preference:preference-ktx:${Versions.preference}"
}

object Room {
    //room
    const val androidx_room = "androidx.room:room-runtime:${Versions.room}"
    const val androidx_room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val androidx_room_ktx = "androidx.room:room-ktx:${Versions.room}"
    const val androidx_room_testing = "androidx.room:room-testing:${Versions.room}"

}
object Navigation{
    //navigation
    const val androidx_navigation_ui =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val androidx_navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
}

object Testing{
    //testing
    const val kotlin_test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val androidx_core_testing = "androidx.arch.core:core-testing:${Versions.core_testing}"
    const val androidx_espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val androidx_junit = "androidx.test.ext:junit:${Versions.androidx_junit}"
    const val junit = "junit:junit:${Versions.junit}"
    const val runner = "com.android.support.test:runner:${Versions.runner}"
    const val mockito_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockito_android = "org.mockito:mockito-android:${Versions.mockito}"
}