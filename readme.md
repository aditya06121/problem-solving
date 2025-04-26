# Problem-Solving Project

This repository contains solutions to various algorithmic problems implemented in C++. Each solution is designed to be efficient and easy to understand. The project is structured to allow easy compilation and execution of individual solutions.

## How to Use

### Prerequisites

- A C++ compiler (e.g., `g++`) supporting C++23.
- Bash shell (default on macOS and Linux).

### Running a Solution

1. Navigate to the project directory:

   ```bash
   cd /Users/aditya/Developer/problem-solving
   ```

2. Use the `run.sh` script to compile and execute a specific solution:

   ```bash
   ./run.sh <cpp_file_name>
   ```

   Replace `<cpp_file_name>` with the name of the C++ file you want to run (e.g., `containsDuplicate.cpp`).

   Example:

   ```bash
   ./run.sh containsDuplicate.cpp
   ```

3. The script will:
   - Search for the specified file.
   - Compile it into the `build/bin` directory.
   - Execute the compiled binary.

### `run.sh`

A utility script to automate the compilation and execution of C++ files. It ensures that the `build/bin` directory exists and handles errors during compilation.

## Contributing

Feel free to contribute by:

- Adding new solutions to algorithmic problems.
- Improving existing solutions.
- Enhancing the `run.sh` script.

## License

This project is open-source and available under the MIT License.
