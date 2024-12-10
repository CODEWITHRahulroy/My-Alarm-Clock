# MyAlarmApp  
**Developed by Rahul Roy**
## Check the master branch for the code


## Aim of the Project  
The aim of the **MyAlarmApp** is to provide users with a functional and engaging alarm application for Android devices. Below are the key objectives:  
1. **Alarm Setting and Notification**: Allow users to set an alarm using a user-friendly interface with a TimePicker and receive a notification when the alarm goes off.  
2. **Vibration and Sound Alerts**: Enhance the alarm experience by vibrating the device and playing an alarm sound to ensure users are alerted effectively.  
3. **Visual Engagement**: Display random greeting images when the alarm notification is opened, adding a touch of personalization and fun.  
4. **Usability and Accessibility**: Ensure the app is easy to use, with clear notifications, and supports various Android devices and versions.

---

## Main Components

### **MainActivity**  
The MainActivity serves as the primary interface for setting alarms.  
**Key Features**:  
- Alarm scheduling via `AlarmManager`.  
- Notification channel setup for alarm reminders.  
- User-friendly TimePicker for alarm configuration.  

**Core Methods**:  
1. `onCreate()`  
   - Sets up the TimePicker and Button for alarm scheduling.  
   - Configures the notification channel.  
2. `notification()`  
   - Creates a notification channel for devices running Android O and higher.  
3. `setTimer()`  
   - Schedules alarms based on user-selected time.  

---

### **Broadcast Receiver**  
**MyBroadcastReceiver** handles alarm triggers, delivering notifications, and engaging users with sound and vibration.  

**Core Actions**:  
- Displays notifications with a redirection to a **GreetingActivity**.  
- Vibrates the device for 2 seconds.  
- Plays an alarm sound for 15 seconds using `MediaPlayer`.

---

### **GreetingActivity**  
**GreetingActivity** is designed to display random greeting images when users interact with the alarm notification.  

**Key Features**:  
- Utilizes an `ImageView` to showcase personalized greeting images.  
- Randomly selects an image from a predefined array for variety.

---

## Gradle Build Script (build.gradle)  
Key configurations include:  
- **SDK Levels**:  
  - `compileSdk`: 31  
  - `minSdk`: 21  
  - `targetSdk`: 31  
- **Dependencies**:  
  - AndroidX, Material Design, ConstraintLayout, and testing libraries like JUnit and Espresso.  
- **Java Compatibility**: Configured for Java 8.  

---

## Android Manifest  
**AndroidManifest.xml** defines the app’s structure and permissions.  

### Key Components:  
1. **Permissions**:  
   - `android.permission.VIBRATE` for vibration functionality.  
2. **Application Settings**:  
   - App icons, theme, and RTL support.  
3. **Declared Activities**:  
   - `MainActivity`: Launcher activity.  
   - `GreetingActivity`: Displays random greeting images.  
4. **Broadcast Receiver**:  
   - `MyBroadcastReceiver`: Triggers alarm notifications.  

---

## Features  
- **Custom Alarms**: Set alarms with ease using the intuitive TimePicker.  
- **Interactive Notifications**: Display personalized greeting images upon alarm interaction.  
- **Sound and Vibration**: Never miss an alarm with engaging sound and vibration alerts.  
- **Cross-Version Support**: Ensures compatibility across multiple Android versions.  

---

## Future Enhancements  
1. Customization options for alarm sounds and themes.  
2. Support for multiple alarms.  
3. User feedback integration for continuous improvements.  

---

## Conclusion  
The **MyAlarmApp** is a reliable and engaging alarm application that combines functionality with personalization. It serves as a strong foundation for further enhancements, ensuring a delightful user experience.  

Great work on building this comprehensive and innovative alarm application!  
