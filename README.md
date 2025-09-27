# Laik 💇‍♀️

Una aplicación Android moderna desarrollada en Kotlin para la gestión y visualización de peinados, construida con Jetpack Compose y siguiendo las mejores prácticas de desarrollo Android.

## 📱 Descripción

Laik es una aplicación que permite a los usuarios explorar, gestionar y editar información sobre diferentes tipos de peinados. La app incluye funcionalidades para visualizar fotos, precios y gestionar una lista personalizada de peinados.

## ✨ Características

- 🎨 **Interfaz moderna** con Jetpack Compose
- 📸 **Gestión de imágenes** de peinados
- 💰 **Sistema de precios** integrado
- 📝 **Edición de peinados** con formularios intuitivos
- 🎯 **Navegación fluida** con Compose Navigation
- 🌈 **Diseño Material 3** con gradientes personalizados

## 🏗️ Arquitectura

La aplicación sigue una arquitectura limpia y organizada:

```
app/src/main/java/com/example/laik/
├── data/           # Modelos de datos
├── screen/         # Pantallas de la aplicación
├── ui/theme/       # Tema y estilos
├── widget/         # Componentes reutilizables
└── model/          # Definición de rutas
```

## 🛠️ Tecnologías Utilizadas

- **Lenguaje**: Kotlin
- **UI Framework**: Jetpack Compose
- **Design System**: Material Design 3
- **Arquitectura**: MVVM (Model-View-ViewModel)
- **Navigation**: Compose Navigation
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## 📋 Requisitos del Sistema

- Android 7.0 (API level 24) o superior
- Kotlin 1.8+
- Android Studio Flamingo | 2022.2.1 o superior
- Gradle 8.0+

## 🚀 Instalación y Configuración

### Prerrequisitos

1. Instalar [Android Studio](https://developer.android.com/studio)
2. Configurar un dispositivo Android o emulador

### Pasos de instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/laik.git
   cd laik
   ```

2. **Abrir el proyecto**
   - Abre Android Studio
   - Selecciona "Open an existing project"
   - Navega hasta la carpeta del proyecto

3. **Sincronizar dependencias**
   ```bash
   ./gradlew build
   ```

4. **Ejecutar la aplicación**
   - Conecta un dispositivo Android o inicia un emulador
   - Presiona Run (▶️) o usa `Ctrl+R`

## 🧪 Testing

### Ejecutar tests unitarios
```bash
./gradlew test
```

### Ejecutar tests instrumentados
```bash
./gradlew connectedAndroidTest
```

## 📱 Pantallas de la Aplicación

- **MainActivity**: Pantalla principal con navegación
- **MainScreen**: Dashboard principal
- **PeinadoListScreen**: Lista de peinados disponibles
- **PeinadoEditarScreen**: Edición de información de peinados

## 🎨 Componentes UI

### Widgets personalizados
- `PeinadoCard`: Tarjeta para mostrar información de peinados
- `PeinadoDialog`: Diálogo modal para acciones rápidas
- `PeinadoListItem`: Item de lista optimizado
- `TopBar` & `BottomBar`: Barras de navegación
- `GradientBackground`: Fondo con gradiente personalizado

## 🏗️ Estructura del Proyecto

```
laik/
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   └── java/com/example/laik/
│       ├── test/
│       └── androidTest/
├── build.gradle.kts
├── gradle/
└── README.md
```

## 🤝 Contribución

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

### Estándares de código

- Seguir las [convenciones de código de Kotlin](https://kotlinlang.org/docs/coding-conventions.html)
- Usar [ktlint](https://ktlint.github.io/) para formateo
- Escribir tests para nuevas funcionalidades
- Documentar funciones públicas

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 👨‍💻 Autor

**Tu Nombre**
- GitHub: [@tu-usuario](https://github.com/tu-usuario)
- Email: tu-email@ejemplo.com

## 🙏 Agradecimientos

- [Jetpack Compose](https://developer.android.com/jetpack/compose) por el framework de UI
- [Material Design](https://material.io/) por las guías de diseño
- [Android Developers](https://developer.android.com/) por la documentación

---

⭐ ¡No olvides darle una estrella al proyecto si te resultó útil!
