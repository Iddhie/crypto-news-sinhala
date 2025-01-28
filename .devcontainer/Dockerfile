# Use the official VS Code dev container base image
FROM mcr.microsoft.com/vscode/devcontainers/base:ubuntu

# Install dependencies
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get install -y curl git unzip xz-utils zip libglu1-mesa \
    && rm -rf /var/lib/apt/lists/*

# Install Flutter
RUN git clone https://github.com/flutter/flutter.git /usr/local/flutter
ENV PATH="/usr/local/flutter/bin:/usr/local/flutter/bin/cache/dart-sdk/bin:${PATH}"

# Run Flutter Doctor to download necessary dependencies
RUN flutter doctor

# Accept Android licenses (if you're planning to develop for Android)
# Uncomment the following lines if needed
# RUN yes | flutter doctor --android-licenses
# RUN flutter config --enable-web

# Precache Flutter artifacts
RUN flutter precache
