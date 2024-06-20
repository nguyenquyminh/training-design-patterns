RemoteControl is tightly coupled with specific devices (Light, GarageDoor), making it difficult to add new devices or commands.

Use the Command pattern to solve this issue.

Hint:
- Define Command interface and the concrete commands (for each actions)
- The new RemoteControl should work as an invoker class. It will hold command and execute request.