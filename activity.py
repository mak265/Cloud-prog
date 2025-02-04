# Initialize an empty list to store tasks
tasks = []

# Function to add a task
def add_task():
    task = input("Enter task: ")
    tasks.append(task)
    print(f"Task added: {task}")

# Function to run the scheduler
def run_scheduler():
    print("\nRunning Task Scheduler...")
    if not tasks:
        print("No tasks to run.")
    else:
        for task in tasks:
            print(f"Executing task: {task}")

# Main function
def main():
    while True:
        print("\nTask Scheduler Menu:")
        print("1. Add Task")
        print("2. Run Scheduler")
        print("3. Exit")
        choice = input("Enter your choice: ")

        if choice == "1":
            add_task()
        elif choice == "2":
            run_scheduler()
        elif choice == "3":
            print("Exiting Task Scheduler...")
            break
        else:
            print("Invalid choice. Please try again.")

# Run the script
if __name__ == "__main__":
    main()
    
