public double runExperiment(int totalDrops) {
    int hits = 0;

    for (int i = 0; i < totalDrops; i++) {
        double yLow = generator.nextDouble() * 2;
        double alpha = generator.nextDouble() * 180;

        double yHigh = yLow + Math.sin(Math.toRadians(alpha));

        if (yHigh >= 2) {
            hits++;
        }
    }

    return (double) totalDrops / hits;
}