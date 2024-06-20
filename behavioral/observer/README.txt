WeatherStation - A class that tracks weather data.
CurrentConditionsDisplay - Displays the current weather temparature.
StatisticsDisplay - Displays stats based on previous data.
ForecastDisplay - Display future weather.

Each display class queries the WeatherStation for updates, which causes high coupling and violates the principle
of separation of concerns.
Use Observer pattern to solve this issue.

Hint:
- Identity which will be "Subject" and which will be "Observer"