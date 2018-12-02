public class RunResult {
        private Animal animal1;
        private Animal animal2;
        private boolean success2;

        public RunResult(Animal animal1, Animal animal2, boolean success2) {

            this.animal1 = animal1;
            this.animal2 = animal2;
            this.success2 = success2;
        }

        public boolean isSuccess() {
            return success2;
        }
    }

