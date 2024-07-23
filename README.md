 # Bookbox Android App

Bookbox is a decentralized book library application for Android, designed to facilitate reading, publishing, and maintaining royalties as NFTs (Non-Fungible Tokens). Leveraging blockchain technology, Bookbox ensures transparency, security, and fairness in the book publishing ecosystem.

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Decentralized Library**: Access a wide range of books in a decentralized manner.
- **NFT Royalties**: Authors can publish books and receive royalties as NFTs.
- **User Authentication**: Secure user authentication and account management.
- **Book Search**: Efficient search functionality to find books quickly.
- **Reading Experience**: Seamless reading experience with customizable settings.
- **Blockchain Integration**: Integration with blockchain for secure and transparent transactions.
- **Real-time Updates**: Real-time data updates using Firestore.

## Tech Stack

- **Frontend**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **Backend**: Spring Boot
- **Database**: MongoDB
- **Blockchain**: Solana
- **Other Libraries**: 
  - Kotlin Coroutines
  - Firebase Firestore
  - Retrofit
  - Coil for image loading
  - Dagger Hilt for dependency injection

## Architecture

The Bookbox app follows the MVVM architecture pattern, ensuring a clean separation of concerns and a maintainable codebase.

### MVVM Components

- **Model**: Manages the data and business logic of the app.
- **View**: Represents the UI components and handles user interaction.
- **ViewModel**: Acts as a mediator between the Model and the View, managing UI-related data in a lifecycle-conscious way.

### Data Flow

1. **User Interaction**: User interacts with the UI.
2. **ViewModel**: ViewModel processes the user input and updates the data.
3. **Model**: Model retrieves/stores data from/to the database or network.
4. **ViewModel**: ViewModel updates the UI state.
5. **UI Update**: View reflects the changes in the UI.

## Installation

To run the Bookbox app locally, follow these steps:

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/your-username/bookbox.git
    ```

2. **Open the Project**: Open the project in Android Studio.

3. **Set Up Firebase**:
    - Add your `google-services.json` file in the `app` directory.
    - Configure Firebase Firestore in your Firebase project.

4. **Build the Project**: Sync and build the project in Android Studio.

5. **Run the App**: Run the app on an emulator or a physical device.

## Usage

1. **Sign Up/Login**: Create an account or log in with your existing credentials.
2. **Browse Books**: Explore the library and find books of your interest.
3. **Read Books**: Start reading books with a seamless and customizable reading experience.
4. **Publish Books**: Authors can publish their books and manage royalties as NFTs.

## Contributing

We welcome contributions from the community! If you'd like to contribute, please follow these steps:

1. **Fork the Repository**: Click on the 'Fork' button at the top right corner of the repository page.
2. **Clone Your Fork**:
    ```bash
    git clone https://github.com/your-username/bookbox.git
    ```
3. **Create a Branch**:
    ```bash
    git checkout -b feature-branch
    ```
4. **Make Your Changes**: Implement your changes and commit them with a meaningful message.
5. **Push to Your Branch**:
    ```bash
    git push origin feature-branch
    ```
6. **Create a Pull Request**: Open a pull request from your forked repository to the main repository.

## License

This project is licensed under the MIT License. See the [LICENSE](https://github.com/satyamsharma17/Bookbox/blob/master/LICENSE) file for more details.

---

Feel free to reach out if you have any questions or need further assistance!

Happy Coding!
