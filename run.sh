#!/bin/bash

# Usage: ./run.sh 0001_two_sum.cpp
# (No need to specify folder.)

file_name="$1"

if [ -z "$file_name" ]; then
  echo "Usage: ./run.sh <cpp_file_name>"
  exit 1
fi

# Find the file recursively
file_path=$(find . -type f -name "$file_name" | head -n 1)

if [ -z "$file_path" ]; then
  echo "Error: File '$file_name' not found."
  exit 1
fi

# Extract the filename without extension
binary_name=$(basename "$file_name" .cpp)

# Make build and bin directories if they don't exist
mkdir -p build/bin

# Compile the found file
g++ -std=c++23 "$file_path" -o build/bin/"$binary_name"

# Check if compilation was successful
if [ $? -eq 0 ]; then
  echo "✅ Compiled successfully."
  # Run the binary
  ./build/bin/"$binary_name"
else
  echo "❌ Compilation failed."
fi
