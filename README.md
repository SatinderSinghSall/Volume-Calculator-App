# Android App:

# Section 18 Volume Calculator - Mastering Adapters & GridView: Volume Calculator App

---

# 📐 Volume Calculator

An Android application that helps you **calculate volumes of common 3D shapes** with a clean and modern UI. Built with **Java, Material Design, and GridView**.

---

## ✨ Features

- 🎨 **Modern UI** using Material Design & CardView
- 📊 **Interactive grid layout** for shape selection
- 🔢 Calculate volumes for shapes like:

  - Sphere
  - Cylinder
  - Cube
  - Prism

- 📱 Fully responsive and adaptive to different screen sizes

---

## 🖼️ Screenshots

```markdown
![Home Screen](screenshots/home.png)
![Shape Selection](screenshots/shape_selection.png)
```

---

## 🛠️ Tech Stack

- **Language**: Java ☕
- **UI Framework**: AndroidX + Material Components
- **Layout**: ConstraintLayout, GridView, MaterialCardView
- **Adapter Pattern**: Custom ArrayAdapter for GridView

---

## 📂 Project Structure

# File Tree: Volume Calculator - 2

Generated on: 9/12/2025, 11:26:02 PM
Root path: `e:\Full-Stack Mobile App Development\Android App Development by Abbass Masri\Section 18 Volume Calculator - Mastering Adapters & GridView\Volume Calculator - 2`

```
├── 📁 .git/ 🚫 (auto-hidden)
├── 📁 .gradle/ 🚫 (auto-hidden)
├── 📁 .idea/ 🚫 (auto-hidden)
├── 📁 app/
│   ├── 📁 build/ 🚫 (auto-hidden)
│   ├── 📁 src/
│   │   ├── 📁 androidTest/
│   │   │   └── 📁 java/
│   │   │       └── 📁 com/
│   │   │           └── 📁 example/
│   │   │               └── 📁 volumecalculator/
│   │   │                   └── ☕ ExampleInstrumentedTest.java
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 example/
│   │   │   │           └── 📁 volumecalculator/
│   │   │   │               ├── ☕ MainActivity.java
│   │   │   │               ├── ☕ MyCustomAdapter.java
│   │   │   │               └── ☕ Shape.java
│   │   │   ├── 📁 res/
│   │   │   │   ├── 📁 drawable/
│   │   │   │   │   ├── 🖼️ app_background.jpg
│   │   │   │   │   ├── 🖼️ back2.jpg
│   │   │   │   │   ├── 🖼️ cube.png
│   │   │   │   │   ├── 🖼️ cylinder.png
│   │   │   │   │   ├── 🖼️ default_image.png
│   │   │   │   │   ├── 📄 ic_launcher_background.xml
│   │   │   │   │   ├── 📄 ic_launcher_foreground.xml
│   │   │   │   │   ├── 🖼️ prism.png
│   │   │   │   │   └── 🖼️ sphere.png
│   │   │   │   ├── 📁 layout/
│   │   │   │   │   ├── 📄 activity_main.xml
│   │   │   │   │   └── 📄 grid_item_layout.xml
│   │   │   │   ├── 📁 mipmap-anydpi-v26/
│   │   │   │   │   ├── 📄 ic_launcher.xml
│   │   │   │   │   └── 📄 ic_launcher_round.xml
│   │   │   │   ├── 📁 mipmap-hdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-mdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xhdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xxhdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xxxhdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 values/
│   │   │   │   │   ├── 📄 colors.xml
│   │   │   │   │   ├── 📄 strings.xml
│   │   │   │   │   └── 📄 themes.xml
│   │   │   │   ├── 📁 values-night/
│   │   │   │   │   └── 📄 themes.xml
│   │   │   │   └── 📁 xml/
│   │   │   │       ├── 📄 backup_rules.xml
│   │   │   │       └── 📄 data_extraction_rules.xml
│   │   │   └── 📄 AndroidManifest.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 example/
│   │                   └── 📁 volumecalculator/
│   │                       └── ☕ ExampleUnitTest.java
│   ├── 🚫 .gitignore
│   ├── 🟦 build.gradle.kts 🚫 (auto-hidden)
│   └── 📄 proguard-rules.pro
├── 📁 build/ 🚫 (auto-hidden)
├── 📁 gradle/
│   ├── 📁 wrapper/
│   │   ├── ☕ gradle-wrapper.jar 🚫 (auto-hidden)
│   │   └── 📄 gradle-wrapper.properties 🚫 (auto-hidden)
│   └── ⚙️ libs.versions.toml
├── 🚫 .gitignore
├── 📖 README.md
├── 🟦 build.gradle.kts 🚫 (auto-hidden)
├── 📄 gradle.properties
├── 📄 gradlew
├── 🐚 gradlew.bat
├── 📄 local.properties 🚫 (auto-hidden)
└── 🟦 settings.gradle.kts
```

---

Generated by FileTree Pro Extension

---

## 🚀 Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) (latest version recommended)
- Android SDK 24+
- Gradle

### Installation & Run

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/volume-calculator.git
   cd volume-calculator
   ```

2. Open the project in **Android Studio**.
3. Build & run on an emulator or physical device.

---

## 🧩 Future Improvements

- ➕ Add more 3D shapes (cone, pyramid, torus, etc.)
- 🎛️ Switch to **RecyclerView** for better performance
- ✍️ Add input dialogs for dimensions & formulas
- 🌙 Dark mode support

---
