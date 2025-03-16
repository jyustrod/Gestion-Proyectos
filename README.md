# Plataforma Inteligente de Gestión de Proyectos con IA

[![Repositorio](https://img.shields.io/badge/GitHub-Repositorio-blue?logo=github)](https://github.com/jyustrod/Gestion-Proyectos.git) [![Video Explicativo](https://img.shields.io/badge/Ver-Video-red)](https://myuax-my.sharepoint.com/:v:/p/jyustrod/EbLKn14KYuxDl2DYNiCfUogBSWnmyWObBpYOSvPF3Duiow?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=plzTec)

## **Descripción del Proyecto**
Este proyecto consiste en el diseño e implementación de una plataforma inteligente de gestión de proyectos potenciada por inteligencia artificial (IA). La arquitectura está basada en principios y patrones de diseño modernos para garantizar modularidad, escalabilidad y mantenibilidad.

## **Tecnologías Utilizadas**
- **Lenguaje:** Java (POO)
- **Framework de Pruebas:** JUnit
- **Gestión de Dependencias:** Maven
- **Control de Versiones:** Git y GitHub
- **Integración Continua:** GitHub Actions
- **Contenedorización:** Docker *(posible mejora futura)*
- **Base de Datos:** PostgreSQL *(o cualquier SQL adaptable)*

## **Objetivos del Proyecto**
1. Diseñar una arquitectura modular y flexible.
2. Aplicar principios de diseño de software (S.O.L.I.D., DRY, KISS, YAGNI).
3. Implementar patrones de diseño clave (Factory Method, Adapter, Observer).
4. Garantizar la calidad del código mediante pruebas unitarias e integración.
5. Comparar la arquitectura con modelos industriales y proponer mejoras futuras.

## **Principios y Patrones de Diseño Aplicados**

### **Principios de Diseño**
- **S.O.L.I.D.:** Desacoplamiento y extensibilidad del código.
- **DRY (Don't Repeat Yourself):** Reutilización y modularidad.
- **KISS (Keep It Simple, Stupid):** Código claro y sin sobreingeniería.
- **YAGNI (You Ain't Gonna Need It):** Evitar implementaciones innecesarias.

### **Patrones de Diseño Implementados**
- **Factory Method (Creacional):** Facilita la creación de tareas personalizadas sin modificar la lógica del sistema.

- **Adapter (Estructural):** Permite la integración con herramientas externas como Trello y Google Drive.

- **Observer (Comportamiento):** Gestiona notificaciones en tiempo real para cambios en tareas.


## **Estrategia de Control de Calidad**
- **Pruebas unitarias con JUnit**: Validación de cada módulo.
- **Pruebas de integración**: Verificación de comunicación entre módulos.
- **CI/CD con GitHub Actions**: Automatización de pruebas en cada push.

## **Estructura del Proyecto**
```
Proyecto
 ┣ src
 ┃ ┣ main
 ┃ ┃ ┣ java
 ┃ ┃ ┃ ┣ modelo  # Clases principales
 ┃ ┃ ┃ ┣ fabrica # Implementación de Factory Method
 ┃ ┃ ┃ ┣ adaptador # Implementación de Adapter
 ┃ ┃ ┃ ┣ observador # Implementación de Observer
 ┃ ┣ test  # Pruebas unitarias
 ┣ pom.xml  # Configuración de Maven
 ┣ README.md  # Documentación del proyecto
 ┣ .github/workflows/ci.yml  # Pipeline de CI/CD
```

## **Instrucciones de Uso**
1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/usuario/proyecto.git
   ```
2. **Compilar el proyecto con Maven:**
   ```sh
   mvn clean install
   ```
3. **Ejecutar las pruebas unitarias:**
   ```sh
   mvn test
   ```

## **Mejoras Futuras**
- Migración a microservicios para mayor escalabilidad.
- Implementación de cacheo y optimización en base de datos.
- Contenedorización con Docker y orquestación con Kubernetes.

## **Autores**
- **jyustrod** - Arquitectura y Desarrollo

